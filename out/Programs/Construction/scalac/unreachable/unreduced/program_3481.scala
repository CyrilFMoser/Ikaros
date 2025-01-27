package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D], c: Char) extends T_A[T_B[T_B[Int, Boolean], (Byte,(Byte,Int))]]
case class CC_B(a: ((Byte,Boolean),((Boolean,Boolean),Boolean)), b: CC_A[T_B[Boolean, Char]]) extends T_A[T_B[T_B[Int, Boolean], (Byte,(Byte,Int))]]
case class CC_C() extends T_A[T_B[T_B[Int, Boolean], (Byte,(Byte,Int))]]
case class CC_D[E](a: E) extends T_B[E, CC_C]
case class CC_E(a: (CC_B,CC_D[CC_B]), b: T_B[Int, CC_C], c: T_A[CC_C]) extends T_B[CC_A[T_B[CC_B, CC_C]], CC_C]
case class CC_F[F, G](a: (CC_A[CC_B],(CC_E,CC_B)), b: (Boolean,CC_E), c: (T_B[CC_E, CC_B],T_B[Char, CC_C])) extends T_B[G, F]

val v_a: T_B[T_A[T_B[T_B[Int, Boolean], (Byte,(Byte,Int))]], CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _)) => 0 
  case CC_D(CC_C()) => 1 
  case CC_F(_, (_,CC_E(_, _, _)), _) => 2 
}
}
// This is not matched: CC_D(CC_A(_, _, _))