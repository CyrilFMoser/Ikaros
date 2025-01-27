package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_A[Boolean, T_B[Int]], b: T_A[T_A[Int, Byte], T_B[Int]]) extends T_A[T_B[T_B[Boolean]], T_A[T_A[Int, Char], T_A[Char, Int]]]
case class CC_B(a: T_B[T_A[CC_A, (Byte,Byte)]], b: Int) extends T_A[T_B[T_B[Boolean]], T_A[T_A[Int, Char], T_A[Char, Int]]]
case class CC_C(a: CC_B) extends T_A[T_B[T_B[Boolean]], T_A[T_A[Int, Char], T_A[Char, Int]]]

val v_a: T_A[T_B[T_B[Boolean]], T_A[T_A[Int, Char], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_)