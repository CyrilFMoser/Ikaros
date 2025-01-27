package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Boolean], T_B[Boolean, Char]]) extends T_A[T_A[Byte]]
case class CC_B(a: T_A[T_A[Byte]], b: CC_A) extends T_A[T_A[Byte]]
case class CC_C(a: CC_B, b: (Byte,(CC_B,CC_A)), c: T_A[T_A[Byte]]) extends T_B[CC_B, CC_B]
case class CC_D[D](a: (T_A[CC_B],T_B[CC_B, CC_B]), b: CC_A, c: D) extends T_B[D, CC_A]
case class CC_E(a: Int, b: Byte) extends T_B[CC_B, CC_B]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, CC_A(_)), (_,(_,_)), CC_A(_)) => 0 
  case CC_C(CC_B(_, CC_A(_)), (_,(_,_)), CC_B(_, CC_A(_))) => 1 
  case CC_E(_, _) => 2 
}
}