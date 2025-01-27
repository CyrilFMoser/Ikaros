package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[H, G](a: T_B[H, G], b: T_A[H, G], c: T_A[G, G]) extends T_A[G, H]
case class CC_C[I]() extends T_A[I, T_A[CC_A[I, I], I]]
case class CC_D[J](a: T_A[J, J], b: (CC_A[Char, Byte],Char)) extends T_B[(T_A[(Byte,Char), Int],(Byte,(Byte,Byte))), J]
case class CC_E[K]() extends T_B[(T_A[(Byte,Char), Int],(Byte,(Byte,Byte))), K]
case class CC_F[L]() extends T_B[(T_A[(Byte,Char), Int],(Byte,(Byte,Byte))), L]

val v_a: T_B[(T_A[(Byte,Char), Int],(Byte,(Byte,Byte))), Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), (_,_)) => 0 
  case CC_D(CC_B(_, _, _), (_,_)) => 1 
  case CC_F() => 2 
}
}
// This is not matched: CC_E()