package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[Int, T_A[Char, ((Boolean,Byte),Char)]]
case class CC_B(a: T_A[CC_A, T_B[(Int,Boolean)]], b: T_B[T_B[CC_A]], c: Boolean) extends T_A[Int, T_A[Char, ((Boolean,Byte),Char)]]
case class CC_C(a: T_B[CC_A], b: (T_B[CC_B],T_B[CC_A])) extends T_A[Int, T_A[Char, ((Boolean,Byte),Char)]]
case class CC_D(a: CC_C) extends T_B[(T_A[CC_B, CC_C],T_B[(Int,Byte)])]
case class CC_E() extends T_B[(T_A[CC_B, CC_C],T_B[(Int,Byte)])]
case class CC_F[D](a: CC_B) extends T_B[D]

val v_a: T_B[(T_A[CC_B, CC_C],T_B[(Int,Byte)])] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _)) => 0 
  case CC_E() => 1 
  case CC_F(CC_B(_, CC_F(_), _)) => 2 
}
}