package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[(Int,Char), Boolean], T_A[(Boolean,Boolean), Boolean]], b: T_A[(Char,Byte), T_A[(Int,Boolean), Int]]) extends T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Byte, Int]]]
case class CC_B(a: T_A[CC_A, T_A[CC_A, Boolean]]) extends T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Byte, Int]]]
case class CC_C(a: Int) extends T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Byte, Int]]]

val v_a: T_A[T_A[Char, Byte], T_A[T_A[Char, Byte], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}