package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: C) extends T_A[T_A[(Char,Char), T_A[Boolean, Byte]], C]
case class CC_B(a: CC_A[((Boolean,Byte),Boolean)], b: CC_A[CC_A[Boolean]]) extends T_A[T_A[(Char,Char), T_A[Boolean, Byte]], T_A[CC_A[Char], T_A[Char, Int]]]
case class CC_C[D](a: CC_A[D], b: T_A[CC_A[D], D]) extends T_A[CC_A[D], D]

val v_a: T_A[T_A[(Char,Char), T_A[Boolean, Byte]], T_A[CC_A[Char], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}