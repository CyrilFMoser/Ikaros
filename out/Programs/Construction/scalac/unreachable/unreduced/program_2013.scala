package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, (Char,Boolean)], T_A[(Byte,Int), (Char,Int)]]) extends T_A[T_A[(Char,Byte), T_A[Char, Char]], Char]
case class CC_B(a: T_A[(CC_A,Char), T_A[CC_A, CC_A]], b: (Int,T_A[CC_A, CC_A])) extends T_A[T_A[(Char,Byte), T_A[Char, Char]], Char]
case class CC_C() extends T_A[T_A[(Char,Byte), T_A[Char, Char]], Char]

val v_a: T_A[T_A[(Char,Byte), T_A[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)