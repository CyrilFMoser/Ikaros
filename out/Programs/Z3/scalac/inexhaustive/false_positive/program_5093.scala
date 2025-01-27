package Program_14 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[(T_B,(Boolean,Byte))]
case class CC_B[B, C](a: CC_A, b: C, c: C) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, _) => 0 
}
}
// This is not matched: (CC_B Byte
//      (Tuple Boolean Wildcard)
//      Wildcard
//      (Tuple Boolean Byte)
//      Wildcard
//      (T_A Byte))
// This is not matched: (CC_C Wildcard
//      (CC_A (T_A Char))
//      (CC_C Wildcard (CC_A (T_A Char)) (CC_A (T_A Char)) (T_A Char))
//      (T_A Char))