package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Boolean,Byte), b: T_A[C, C]) extends T_A[C, (Char,Boolean)]

val v_a: T_A[Int, (Char,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _) => 0 
}
}
// This is not matched: (CC_B Boolean
//      (CC_B Boolean Wildcard Wildcard Wildcard (T_A Boolean))
//      Wildcard
//      Wildcard
//      (T_A Boolean))