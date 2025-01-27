package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], Int]
case class CC_B(a: Int, b: Int, c: T_A[CC_A, CC_A]) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], Int]
case class CC_C(a: (T_A[(Int,Byte), (Boolean,Boolean)],CC_A), b: (CC_B,Boolean), c: T_A[CC_A, T_A[CC_B, CC_A]]) extends T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], Int]

val v_a: T_A[T_A[T_A[Int, Boolean], T_A[Char, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, (CC_B(_, _, _),_), _)