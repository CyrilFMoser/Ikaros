package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: (T_A[Char, Char],Boolean), b: T_A[Char, T_A[Int, (Char,Int)]]) extends T_A[T_A[T_A[Int, Int], Byte], T_A[T_A[Int, Char], (Boolean,Byte)]]
case class CC_B(a: T_A[T_A[Int, Byte], CC_A], b: T_A[CC_A, CC_A], c: T_A[T_A[Boolean, CC_A], (CC_A,CC_A)]) extends T_A[T_A[T_A[Int, Int], Byte], T_A[T_A[Int, Char], (Boolean,Byte)]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Int, Int], Byte], T_A[T_A[Int, Char], (Boolean,Byte)]]

val v_a: T_A[T_A[T_A[Int, Int], Byte], T_A[T_A[Int, Char], (Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)