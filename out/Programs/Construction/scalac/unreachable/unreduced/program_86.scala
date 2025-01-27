package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Char]], b: T_A[T_A[Byte]], c: (T_A[(Int,Byte)],T_B[Boolean])) extends T_A[T_B[Boolean]]
case class CC_B(a: CC_A, b: T_A[Byte], c: CC_A) extends T_A[T_B[Boolean]]
case class CC_C() extends T_A[T_B[Boolean]]
case class CC_D(a: (T_B[CC_C],CC_C), b: CC_B) extends T_B[Byte]
case class CC_E[C](a: CC_C) extends T_B[C]
case class CC_F() extends T_B[Byte]

val v_a: T_A[T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_E(_), _, (_,_)) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
  case CC_C() => 2 
}
}