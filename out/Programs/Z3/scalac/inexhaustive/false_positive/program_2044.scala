package Program_30 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B]) extends T_A
case class CC_B(a: Boolean, b: CC_A[Int], c: (Byte,T_A)) extends T_A
case class CC_C[C](a: T_B[C], b: T_A) extends T_B[C]
case class CC_D[D](a: D) extends T_B[D]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _, _)) => 0 
  case CC_C(_, CC_A(_)) => 1 
  case CC_C(CC_C(_, _), _) => 2 
  case CC_C(CC_C(_, _), CC_A(_)) => 3 
  case CC_C(CC_D(_), CC_B(_, _, _)) => 4 
}
}
// This is not matched: (CC_C (CC_B (T_B T_A) (T_B T_A) (T_B T_A) (T_B T_A))
//      (CC_D (CC_B (T_B (T_B T_A)) (T_B T_A) (T_B T_A) (T_B T_A))
//            Wildcard
//            (T_B (CC_B (T_B (T_B T_A)) (T_B T_A) (T_B T_A) (T_B T_A))))
//      (CC_A (T_B T_A) Wildcard T_A)
//      (T_B (CC_B (T_B T_A) (T_B T_A) (T_B T_A) (T_B T_A))))
// This is not matched: Pattern match is empty without constants