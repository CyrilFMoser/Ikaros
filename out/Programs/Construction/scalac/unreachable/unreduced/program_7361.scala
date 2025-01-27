package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: (T_A[Int, Boolean],T_A[Byte, Byte])) extends T_A[((Int,Byte),Byte), D]
case class CC_B[E]() extends T_A[((Int,Byte),Byte), E]
case class CC_C[F, G](a: G) extends T_A[((Int,Byte),Byte), F]

val v_a: T_A[((Int,Byte),Byte), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}