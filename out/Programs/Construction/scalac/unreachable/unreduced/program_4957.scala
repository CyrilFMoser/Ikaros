package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[(Int,Byte), ((Char,Char),Char)], T_A[T_A[(Byte,Boolean), Int], Char]]
case class CC_B(a: T_A[CC_A, CC_A], b: T_A[CC_A, Boolean]) extends T_A[T_A[(Int,Byte), ((Char,Char),Char)], T_A[T_A[(Byte,Boolean), Int], Char]]

val v_a: T_A[T_A[(Int,Byte), ((Char,Char),Char)], T_A[T_A[(Byte,Boolean), Int], Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}