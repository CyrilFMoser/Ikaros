package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B(a: T_A[CC_A[Char], Int], b: Int, c: T_A[T_A[Byte, Byte], T_A[Char, Char]]) extends T_A[Boolean, T_A[CC_A[Int], T_A[(Byte,Byte), Char]]]
case class CC_C(a: Byte) extends T_A[Boolean, T_A[CC_A[Int], T_A[(Byte,Byte), Char]]]

val v_a: T_A[Boolean, T_A[CC_A[Int], T_A[(Byte,Byte), Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
}
}