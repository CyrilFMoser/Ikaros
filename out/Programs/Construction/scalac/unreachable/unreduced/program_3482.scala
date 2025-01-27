package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[(Boolean,(Boolean,Byte))], c: (T_A[Char],T_A[Int])) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: Boolean, b: CC_A) extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[CC_A]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}