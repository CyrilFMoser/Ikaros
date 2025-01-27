package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: D, b: CC_A[D], c: Int) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: (CC_B Char
//      (T_A (T_A (CC_A Boolean Boolean)))
//      Wildcard
//      (CC_A (T_A (T_A (CC_A Boolean (T_A Boolean))))
//            (T_A (T_A (T_A (CC_A Boolean (T_A Boolean))))))
//      Wildcard
//      (T_A Char))
// This is not matched: Pattern match is empty without constants