package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_A[T_A[Boolean, Boolean], (Char,Byte)], T_B[T_B[Boolean]]]
case class CC_B(a: (T_A[Int, CC_A],T_A[CC_A, CC_A]), b: (CC_A,Int)) extends T_A[T_A[T_A[Boolean, Boolean], (Char,Byte)], T_B[T_B[Boolean]]]
case class CC_C[D, E](a: D) extends T_B[D]
case class CC_D[F]() extends T_B[F]
case class CC_E[G](a: CC_D[G], b: CC_B) extends T_B[G]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), CC_B((_,_), (_,_))) => 1 
}
}
// This is not matched: CC_C(CC_A())