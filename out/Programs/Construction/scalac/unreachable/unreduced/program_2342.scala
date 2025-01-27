package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: T_A[T_A[(Boolean,Int), Boolean], T_A[Char, Int]], c: Char) extends T_A[T_A[T_A[(Byte,Boolean), Int], T_A[Int, (Char,Byte)]], T_A[T_A[Byte, (Boolean,Byte)], T_A[Boolean, Int]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[(Byte,Boolean), Int], T_A[Int, (Char,Byte)]], T_A[T_A[Byte, (Boolean,Byte)], T_A[Boolean, Int]]]
case class CC_C() extends T_A[T_A[T_A[(Byte,Boolean), Int], T_A[Int, (Char,Byte)]], T_A[T_A[Byte, (Boolean,Byte)], T_A[Boolean, Int]]]

val v_a: T_A[T_A[T_A[(Byte,Boolean), Int], T_A[Int, (Char,Byte)]], T_A[T_A[Byte, (Boolean,Byte)], T_A[Boolean, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_C() => 2 
}
}