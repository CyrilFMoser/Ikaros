package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[G, H](a: G, b: (T_B[Byte, Byte],T_B[Int, Int])) extends T_A[T_A[CC_A[Char, Boolean], CC_A[Byte, Byte]], G]
case class CC_C[I](a: CC_B[I, I]) extends T_B[I, CC_A[(Int,Byte), CC_B[Int, Char]]]
case class CC_D[J](a: CC_B[J, J], b: T_A[J, J], c: CC_C[J]) extends T_B[J, (CC_A[Byte, Int],CC_B[Char, (Byte,Int)])]
case class CC_E[K](a: (T_B[Byte, Byte],CC_A[Boolean, Byte]), b: T_A[K, K]) extends T_B[K, (CC_A[Byte, Int],CC_B[Char, (Byte,Int)])]

val v_a: T_B[Byte, (CC_A[Byte, Int],CC_B[Char, (Byte,Int)])] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, (_,_)), CC_A(), CC_C(_)) => 0 
  case CC_E(_, _) => 1 
}
}