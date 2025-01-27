package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Boolean, D], b: (T_A[Byte, Boolean],Byte)) extends T_A[Boolean, D]
case class CC_B[E]() extends T_A[Boolean, E]
case class CC_C[F](a: CC_A[F], b: (T_A[(Boolean,Int), Byte],T_A[Boolean, Boolean])) extends T_A[Boolean, F]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
  case CC_C(_, (_,CC_A(_, _))) => 2 
  case CC_C(_, (_,CC_B())) => 3 
  case CC_C(_, (_,CC_C(_, _))) => 4 
}
}