package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_B[Boolean]], b: (Char,T_B[Int]), c: Int) extends T_A[D, T_B[Boolean]]
case class CC_B[E](a: Int, b: T_A[E, T_B[Boolean]], c: E) extends T_A[E, T_B[Boolean]]
case class CC_C(a: Int, b: T_B[T_B[Boolean]]) extends T_A[T_A[(Int,(Byte,Boolean)), CC_B[Char]], T_B[Boolean]]
case class CC_D(a: Int, b: T_A[T_A[Int, CC_C], CC_C], c: T_A[Byte, T_B[Boolean]]) extends T_B[(Int,CC_B[CC_C])]
case class CC_E() extends T_B[(Int,CC_B[CC_C])]
case class CC_F(a: T_A[CC_A[CC_C], T_B[Boolean]]) extends T_B[(Int,CC_B[CC_C])]

val v_a: T_A[Byte, T_B[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,_), _) => 0 
  case CC_A(CC_B(_, _, _), (_,_), _) => 1 
  case CC_B(_, _, _) => 2 
}
}