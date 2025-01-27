package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E]) extends T_A[E, (T_B[Int, Byte],T_B[Boolean, Char])]
case class CC_B[F]() extends T_B[F, ((Int,Byte),T_B[Boolean, Int])]
case class CC_C[G](a: G, b: ((Int,(Byte,Int)),CC_B[Int]), c: T_B[G, G]) extends T_B[G, ((Int,Byte),T_B[Boolean, Int])]
case class CC_D[H](a: Boolean, b: Int) extends T_B[H, ((Int,Byte),T_B[Boolean, Int])]

val v_a: T_B[Boolean, ((Int,Byte),T_B[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_C(_, ((_,_),CC_B()), _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_B()