package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Char]
case class CC_B[D](a: T_A[D, D], b: D, c: T_A[D, Char]) extends T_A[D, Char]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}
// This is not matched: (CC_B Byte
//      Wildcard
//      Wildcard
//      (CC_B Byte
//            Wildcard
//            Wildcard
//            (CC_A Byte Int (T_A Byte Char))
//            (T_A Byte Char))
//      (T_A Byte Char))