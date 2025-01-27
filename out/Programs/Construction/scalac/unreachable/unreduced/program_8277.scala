package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: (T_B[Boolean, Int],Byte)) extends T_A[D]
case class CC_B(a: T_A[T_A[Byte]], b: T_A[Boolean], c: T_A[T_A[Int]]) extends T_A[(T_A[Boolean],(Char,Char))]
case class CC_C() extends T_A[(T_A[Boolean],(Char,Char))]
case class CC_D(a: CC_A[T_B[(Byte,Boolean), (Char,Byte)]]) extends T_B[CC_B, T_A[T_A[CC_C]]]
case class CC_E() extends T_B[CC_B, T_A[T_A[CC_C]]]
case class CC_F[E](a: Byte) extends T_B[E, T_A[E]]

val v_a: T_B[CC_B, T_A[T_A[CC_C]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, (_,_))) => 0 
  case CC_E() => 1 
}
}