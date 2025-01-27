package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F]() extends T_A[D, E]
case class CC_B[H, G](a: Char, b: T_B[G], c: (Boolean,T_A[Int, Int])) extends T_A[G, H]
case class CC_C[J, I](a: J, b: T_A[I, ((Byte,Byte),Char)]) extends T_A[I, J]
case class CC_D(a: CC_B[CC_B[Boolean, Int], CC_A[Byte, Int, Char]], b: Boolean) extends T_B[((Byte,Int),Byte)]
case class CC_E[K](a: T_A[K, K]) extends T_B[((Byte,Int),Byte)]
case class CC_F(a: T_A[T_A[CC_D, (Byte,Char)], Char], b: T_A[CC_D, T_A[CC_D, Int]], c: CC_D) extends T_B[((Byte,Int),Byte)]

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(CC_A(), CC_A(), CC_D(_, _)) => 0 
  case CC_F(CC_B(_, _, _), CC_A(), CC_D(_, _)) => 1 
  case CC_F(CC_C(_, _), CC_A(), CC_D(_, _)) => 2 
  case CC_F(CC_A(), CC_B(_, _, _), CC_D(_, _)) => 3 
  case CC_F(CC_C(_, _), CC_B(_, _, _), CC_D(_, _)) => 4 
  case CC_F(CC_A(), CC_C(_, _), CC_D(_, _)) => 5 
  case CC_F(CC_B(_, _, _), CC_C(_, _), CC_D(_, _)) => 6 
  case CC_F(CC_C(_, _), CC_C(_, _), CC_D(_, _)) => 7 
}
}
// This is not matched: CC_F(CC_B(_, _, _), CC_B(_, _, _), CC_D(_, _))