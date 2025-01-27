package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, Char], T_A[Char, Char]]) extends T_A[T_A[(Byte,Byte), T_A[Int, (Byte,Boolean)]], T_A[T_A[Byte, Byte], Byte]]
case class CC_B(a: T_A[(CC_A,CC_A), T_A[CC_A, CC_A]], b: T_A[(CC_A,CC_A), CC_A], c: Byte) extends T_A[T_A[(Byte,Byte), T_A[Int, (Byte,Boolean)]], T_A[T_A[Byte, Byte], Byte]]
case class CC_C(a: CC_B) extends T_A[T_A[(Byte,Byte), T_A[Int, (Byte,Boolean)]], T_A[T_A[Byte, Byte], Byte]]

val v_a: T_A[T_A[(Byte,Byte), T_A[Int, (Byte,Boolean)]], T_A[T_A[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}