package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, D], b: D) extends T_A[D, T_B[D]]
case class CC_B() extends T_B[(Boolean,(Byte,Char))]
case class CC_C() extends T_B[(Boolean,(Byte,Char))]
case class CC_D(a: (Byte,CC_B)) extends T_B[(Boolean,(Byte,Char))]

val v_a: T_A[T_B[(Boolean,(Byte,Char))], T_B[T_B[(Boolean,(Byte,Char))]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_A(_, CC_D(_)) => 1 
  case CC_A(_, _) => 2 
  case CC_A(_, CC_C()) => 3 
}
}
// This is not matched: (CC_A (T_B (Tuple Boolean (Tuple Byte Char)))
//      Boolean
//      Wildcard
//      (CC_D Wildcard (T_B (Tuple Boolean (Tuple Byte Char))))
//      (T_A (T_B (Tuple Boolean (Tuple Byte Char)))
//           (T_B (T_B (Tuple Boolean (Tuple Byte Char))))))
// This is not matched: (CC_C (CC_B (CC_C Wildcard T_B) Wildcard (T_A Int)) T_B)