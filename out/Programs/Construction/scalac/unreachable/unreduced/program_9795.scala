package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[Boolean], b: T_A[B], c: T_A[B]) extends T_A[Boolean]
case class CC_B(a: T_A[T_A[Boolean]], b: CC_A[(Byte,(Boolean,Char))], c: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_C(a: CC_B, b: Byte) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}