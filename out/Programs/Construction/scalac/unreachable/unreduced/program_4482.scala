package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[(Byte,Byte)]], b: (T_A[Boolean],T_B[Int]), c: T_A[T_A[Int]]) extends T_A[Int]
case class CC_B[C]() extends T_A[Int]
case class CC_C(a: CC_B[Int]) extends T_A[Int]
case class CC_D[D](a: CC_A) extends T_B[D]
case class CC_E[E]() extends T_B[E]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_E(), (_,CC_D(_)), _) => 0 
  case CC_A(CC_D(_), (_,CC_E()), _) => 1 
  case CC_A(CC_E(), (_,CC_E()), _) => 2 
  case CC_B() => 3 
  case CC_C(CC_B()) => 4 
}
}
// This is not matched: CC_A(CC_D(_), (_,CC_D(_)), _)