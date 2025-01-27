package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Char,Boolean)) extends T_A[C, T_A[C, C]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: (CC_A (T_A (T_A Char (Tuple Boolean Int)) (T_A Char Boolean))
//      Byte
//      Wildcard
//      (CC_A (T_A Char (Tuple Boolean Int))
//            (T_A Char Boolean)
//            Byte
//            Wildcard
//            (T_A (T_A Char (Tuple Boolean Int)) (T_A Char Boolean)))
//      (T_A (T_A (T_A Char (Tuple Boolean Int)) (T_A Char Boolean)) Byte))