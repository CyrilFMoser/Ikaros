package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: (T_A[Char],T_A[Byte]), c: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: T_A[T_A[(Int,Byte)]], b: Int) extends T_A[T_B]
case class CC_C(a: T_A[T_B]) extends T_A[T_B]
case class CC_D(a: CC_A, b: T_B, c: CC_B) extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_A(_, _, _)) => 1 
  case CC_C(CC_B(_, _)) => 2 
  case CC_C(CC_C(CC_A(_, _, _))) => 3 
  case CC_C(CC_C(CC_B(_, _))) => 4 
  case CC_C(CC_C(CC_C(_))) => 5 
}
}
// This is not matched: CC_B(_, _)