package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Char,(Byte,Int)), T_A[(Boolean,Char), Boolean]], b: T_A[T_A[Char, Int], Int]) extends T_A[Byte, (T_A[Char, Byte],T_A[(Char,Byte), Char])]
case class CC_B(a: Int, b: Int) extends T_A[Byte, (T_A[Char, Byte],T_A[(Char,Byte), Char])]

val v_a: T_A[Byte, (T_A[Char, Byte],T_A[(Char,Byte), Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}