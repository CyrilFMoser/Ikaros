package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[Boolean]
case class CC_B(a: T_A[T_A[Byte]], b: Boolean, c: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, true, _) => 1 
  case CC_B(_, false, _) => 2 
}
}