package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Int), b: T_A[C, (Int,Boolean)]) extends T_A[C, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: (CC_A Char
//      (CC_A Char
//            (CC_B Char Char (CC_B Char Char Wildcard (T_A Char)) (T_A Char))
//            Byte
//            (T_A Char))
//      Wildcard
//      (T_A Char))