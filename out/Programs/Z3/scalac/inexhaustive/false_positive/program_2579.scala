package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[(Char,Int), (Boolean,Int)]]
case class CC_B() extends T_A[T_B[(Char,Int), (Boolean,Int)]]
case class CC_E(a: Byte, b: T_A[CC_B]) extends T_B[T_A[CC_A], Boolean]

val v_a: T_B[T_A[CC_A], Boolean] = null
val v_b: Int = v_a match{
  case CC_E(0, _) => 0 
}
}
// This is not matched: (CC_C Char
//      Wildcard
//      Byte
//      (CC_A Char
//            (CC_B Char (CC_B Char Wildcard (T_A Char)) (T_A Char))
//            Wildcard
//            Wildcard
//            (T_A Char))
//      (T_A Char))