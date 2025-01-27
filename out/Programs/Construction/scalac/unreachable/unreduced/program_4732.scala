package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Char, Int], T_A[Boolean, Char]], b: T_A[T_A[Char, Int], T_A[Char, Char]]) extends T_A[T_A[T_A[(Boolean,Boolean), (Int,Boolean)], T_A[Char, Boolean]], T_A[(Boolean,Boolean), T_A[(Char,Byte), Byte]]]
case class CC_B() extends T_A[T_A[T_A[(Boolean,Boolean), (Int,Boolean)], T_A[Char, Boolean]], T_A[(Boolean,Boolean), T_A[(Char,Byte), Byte]]]

val v_a: T_A[T_A[T_A[(Boolean,Boolean), (Int,Boolean)], T_A[Char, Boolean]], T_A[(Boolean,Boolean), T_A[(Char,Byte), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}