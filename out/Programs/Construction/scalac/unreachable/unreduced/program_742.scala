package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[Int], c: T_A[Int]) extends T_A[Int]
case class CC_B(a: CC_A, b: T_A[T_A[Boolean]]) extends T_A[Int]
case class CC_C(a: T_A[Boolean], b: (CC_B,T_A[(Byte,Char)])) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, (_,_)) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _, _), _)