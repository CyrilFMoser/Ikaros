package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: T_A[Char]) extends T_A[Char]
case class CC_C(a: Byte) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), CC_B(_, _)) => 0 
  case CC_B(CC_A(_, _), CC_C(_)) => 1 
  case CC_C(_) => 2 
}
}