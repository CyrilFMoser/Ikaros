package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: ((Boolean,Boolean),Char)) extends T_A[C, T_A[C, Boolean]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_B Int
//      Wildcard
//      (CC_A Int
//            Wildcard
//            Wildcard
//            (CC_B Int Wildcard Wildcard Wildcard (T_A Int))
//            (T_A Int))
//      Wildcard
//      (T_A Int))