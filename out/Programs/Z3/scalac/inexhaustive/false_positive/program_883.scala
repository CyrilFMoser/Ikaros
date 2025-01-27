package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: T_A[D, D], b: Byte) extends T_A[D, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
}
}
// This is not matched: (CC_A Char
//      (CC_A Char
//            (CC_B Char Char (CC_B Char Char Wildcard (T_A Char)) (T_A Char))
//            Byte
//            (T_A Char))
//      Wildcard
//      (T_A Char))