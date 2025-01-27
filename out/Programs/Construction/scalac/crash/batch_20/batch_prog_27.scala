package Program_27 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[T_A[T_A[Byte]]], b: T_A[B]) extends T_A[B]
case class CC_B[D](a: CC_A[D]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_B(CC_A(_, _)), CC_A(_, _)) => 1 
  case CC_A(CC_A(_, _), CC_B(CC_A(_, _))) => 2 
  case CC_A(CC_B(CC_A(_, _)), CC_B(CC_A(_, _))) => 3 
  case CC_B(_) => 4 
}
}