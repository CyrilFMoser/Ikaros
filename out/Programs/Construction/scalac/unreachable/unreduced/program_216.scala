package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[T_A[Int, (Boolean,Int)], T_A[Int, (Boolean,Int)]], T_A[T_A[T_A[Int, (Boolean,Int)], T_A[Int, (Boolean,Int)]], T_A[T_A[Int, (Boolean,Int)], T_A[Int, (Boolean,Int)]]]], b: (T_A[(Boolean,Char), Byte],T_A[(Int,Byte), Boolean])) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: Int, b: Int) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _) => 1 
}
}