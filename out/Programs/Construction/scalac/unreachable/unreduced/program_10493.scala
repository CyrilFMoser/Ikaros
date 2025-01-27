package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Byte,Int)], b: T_B[T_A[(Boolean,Byte)]], c: T_A[T_A[Int]]) extends T_A[T_B[T_B[Int]]]
case class CC_B(a: Char, b: (CC_A,CC_A)) extends T_A[T_B[Int]]
case class CC_C(a: T_B[CC_A], b: T_B[T_A[Byte]]) extends T_B[CC_A]
case class CC_D(a: T_B[Char], b: T_A[T_B[Int]], c: (T_B[CC_B],CC_C)) extends T_B[CC_A]
case class CC_E() extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), _) => 0 
  case CC_C(CC_D(_, _, _), _) => 1 
  case CC_D(_, _, (_,CC_C(_, _))) => 2 
  case CC_E() => 3 
}
}
// This is not matched: CC_C(CC_E(), _)