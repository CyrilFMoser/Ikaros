package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]], b: (T_A[Byte],T_A[Byte])) extends T_A[(T_B[Byte],T_A[Byte])]
case class CC_B(a: CC_A) extends T_A[(T_B[Byte],T_A[Byte])]
case class CC_C(a: T_A[T_B[Byte]], b: CC_A) extends T_A[(T_B[Byte],T_A[Byte])]
case class CC_D[C](a: C, b: (T_B[CC_C],CC_C)) extends T_B[C]

val v_a: T_A[(T_B[Byte],T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), (_,_)) => 0 
  case CC_B(CC_A(_, _)) => 1 
}
}
// This is not matched: CC_C(_, _)