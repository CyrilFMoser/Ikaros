package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (T_B[Int],T_A[Boolean])) extends T_A[T_A[Byte]]
case class CC_B() extends T_A[T_A[Byte]]
case class CC_C(a: T_A[T_A[Byte]], b: CC_A, c: (CC_B,T_B[CC_B])) extends T_A[T_A[Byte]]
case class CC_D[C]() extends T_B[C]
case class CC_E() extends T_B[T_A[T_A[Byte]]]
case class CC_F[D](a: Int, b: (Byte,T_A[CC_E]), c: D) extends T_B[D]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, CC_A((_,_)), (CC_B(),CC_D())) => 1 
  case CC_C(_, CC_A((_,_)), (CC_B(),CC_F(_, _, _))) => 2 
}
}
// This is not matched: CC_B()