package builder;

import java.util.Objects;

public class NycPizza {

    public enum Size {SMALL, MEDIUM, LARGE };
    private final Size size;

    public static class Builder extends NycPizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }
    }


}
