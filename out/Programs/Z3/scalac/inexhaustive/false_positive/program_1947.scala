package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: Char) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_C Int
//      Char
//      (CC_B Char Char Char Boolean (T_A Char Char))
//      Wildcard
//      (T_A Char Int))