package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_B(a: T_A[T_A[Int]], b: T_A[CC_A], c: CC_A) extends T_A[T_A[T_A[CC_A]]]
case class CC_C(a: CC_B, b: (CC_A,CC_B), c: (T_A[CC_B],CC_B)) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_C(CC_B(_, _, _), _, (_,_))) => 1 
  case CC_C(_, _, _) => 2 
}
}