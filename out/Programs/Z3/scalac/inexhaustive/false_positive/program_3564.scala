package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: (Byte,Byte)) extends T_A[T_A[Int]]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((0,_)) => 0 
}
}
// This is not matched: (CC_A (CC_C (CC_A (CC_B T_A) Wildcard T_A)
//            (CC_A (CC_B T_A) Int T_A)
//            (CC_B T_A)
//            T_A)
//      Wildcard
//      T_A)