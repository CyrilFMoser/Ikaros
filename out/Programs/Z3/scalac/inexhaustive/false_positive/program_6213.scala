package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Byte)) extends T_A[Int, C]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_C (Tuple Char Char)
//      Wildcard
//      (CC_B (Tuple Char Char)
//            Wildcard
//            (CC_A (Tuple Char Char) (T_A (Tuple Char Char)))
//            Wildcard
//            (T_A (Tuple Char Char)))
//      Wildcard
//      (T_B (T_A (Tuple Char Char)) (Tuple Char Char)))