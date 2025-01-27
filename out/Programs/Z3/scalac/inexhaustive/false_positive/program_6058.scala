package Program_13 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: Boolean, b: T_B[D], c: Boolean) extends T_B[D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: Pattern match is empty without constants