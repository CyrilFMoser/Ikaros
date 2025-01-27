package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, Byte], b: T_A[C, C]) extends T_A[C, Byte]
case class CC_B[D]() extends T_A[D, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A Byte
//      Char
//      (CC_B Byte Byte Wildcard (T_A Byte Byte))
//      (CC_D Char
//            Byte
//            Wildcard
//            (CC_B Byte Char Byte (T_A Byte Char))
//            (T_B Byte Char))
//      Wildcard
//      (T_A Byte Char))